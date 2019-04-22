
<html>

<head>
<link rel="stylesheet" type="text/css" href="mystyle.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>

/****************************************/
/* Create a better multiple select list */
/****************************************/

$(document).ready(function(){


// this first portion of code was borrowed, then modified, from this tutorial: http://kilianvalkhof.com/2010/javascript/how-to-build-a-fast-simple-list-filter-with-jquery/

    var listToFilter = $('.filterList'),
        listToFilterHeader = $('.filterListHeader'),
        bucketList = $('.bucketList'),
        timeout;

    // custom css expression for a case-insensitive contains()
    jQuery.expr[':'].Contains = function(a,i,m){
        return (a.textContent || a.innerText || "").toUpperCase().indexOf(m[3].toUpperCase())>=0;
    };
    function filterList(header, list) { // header is any element, list is an unordered list
        // create and add the filter form to the header
        var form = $("<form>").attr({"class":"filterForm","action":""}),
            input = $("<input>").attr({"class":"filterInput","type":"text"});
        $(form).append(input).appendTo(header);
 $(".filterForm").submit(function() { return false; });
        function filterOnKeyup(that) {
            var filter = that.val();

            if(filter) {
                // this finds all items in a list that contain the input,
                // and hides the ones not containing the input, while showing the ones that do
                var newList = list.find("li:not(:Contains(" + filter + "))").hide().end()
                    .find("li:Contains(" + filter + ")").show();

            } else {
                list.find("li").show();
            }
            return false;
        }
        $(input).keyup(function (e) {
            // fire the above change event after every letter
            var that = $(this);
if (e.which == 13) {
//alert(that+","+e.KeyCode+","+e.which);
        e.preventDefault();
        return false;
    }


            clearTimeout(timeout);
            timeout = setTimeout(function () {filterOnKeyup(that);}, 1000);


        });
    }
    filterList(listToFilterHeader, listToFilter);

// This code adds/removes items to/from the bucket-list


    function removeFromBucketList (that) {
        var listItem = that.parent('li').html();
        listToFilter.prepend('<li>' + listItem + '</li>');
        listToFilter.find('input').removeAttr('checked');
    }
    listToFilter.on('click', 'input', function () {
		console.log($("input#ol"));
        if ($(this).is(':checked')) {
            addToBucketList($(this));
            $(this).parent('li').remove();
        }
    });
    bucketList.on('click', 'input', function () {

        if ($(this).not(':checked')) {
            removeFromBucketList($(this));
            $(this).parent('li').remove();
        }
    });
   //alert();
 
});

   var addToBucketList=function(that) {
		var bucketList = $('.bucketList');
        var listItem = that.parent('li').html();
        bucketList.append('<li>' + listItem + '</li>');
        bucketList.find('input').attr('checked', 'checked');
   };

  var callMyFun=function(selectedObjects){
	for(var i=0;i<selectedObjects.length;i++){
		var selDelName=selectedObjects[i].DELIVERABLE_NAME;
		var listItem = $("input#delId[value='"+selDelName+"']").parent('li').html();
		$('ul.bucketList').append('<li>'+listItem+'</li>');
		$('ul.bucketList').find('input').attr('checked', 'checked');
		$("ul.list.filterList li input#delId[value='"+selDelName+"']").parent('li').remove();
		//$("input#delId[value="+selDelName+"]").trigger("click");
		//alert($("input#delId[value='"+selDelName+"']"));
		//$("input#delId[value='"+selDelName+"']").trigger("click");
		/* var listOfDel=$("input#delId");
		for(var j=0;j<listOfDel.length;j++){
			var selectedDel=listOfDel[i];
			if(selectedDel.value==selDelName){
			   listOfDel[i].trigger("click");
			}
		} */
	}
};


</script>
<style>
h2 {
     font-family: verdana;
    letter-spacing: -0.05em;
    color: #747b8c;
	text-align: center;
}


body  {
    
    font-family: verdana;
    
}
h3 {
	color: #888;
}
.list {
    height: 400px;
    overflow-y: auto;
	font-size: 13;
}
</style>

<h2> CLIENT DELIVERABLE SUBMISSION</h2>
<hr>
</head>
<?php 
require_once('adodb/adodb.inc.php');
$db = NewADOConnection('oci8');
$db->SetFetchMode(ADODB_FETCH_ASSOC);

$task= $_REQUEST['task'];
if (!$db->Connect('webca', 'cpt', 'cpt'))
{
    die("Database unavailable.");
}


$sql = <<<END_SQL
  select d.deliverable_name, d.deliverable_type, nvl2(std.deliverable_name, 'T', 'F') build_deliverable_boo  
    from   (select * from deliverable  
            where  deliverable_version in (select distinct deliverable_version  
                                           from   deliverable  
                                           where  (select release from task where task_number = $task) like deliverable_version||'%')) d  
    left outer join submittedtaskdeliverable std on (std.deliverable_name = d.deliverable_name and std.task_number = $task)  
    order by build_deliverable_boo desc, d.deliverable_type, d.deliverable_name
END_SQL;

//echo "SQL: $sql";

$objects = $db->GetAll($sql, array('DELIVERABLE_NAME' => 'DELIVERABLE_NAME'));

?>

<?php

if(isset($_GET['task'])){
$task= $_GET['task'];
echo "<h3>Submit Deliverables for the task ".($task - 800000000)." </h3>";
echo "Make sure to submit task at <a href=https://intranetca.netcracker.com/prd/releaseallocation/submittask.asp?taskNumber=".$task.">submit</a> before adding deliverables";
}
if(isset($_POST['task'])){
$task= $_POST['task'];
echo "<h3>Submit Deliverables for the task ".($task - 800000000)." </h3>";
echo "Make sure to submit task at <a href=https://intranetca.netcracker.com/prd/releaseallocation/submittask.asp?taskNumber=".$task."&returnURL=".$_POST['returnURL'].">submit</a> before adding deliverables";
}

if(isset($_POST['delarray'])){
$receivedel=$_POST['delarray'];


}


//var_dump($posted_data);
?>


<form class="container" action="submit_del.php" method="post" >
    <div class="listWrapper">
        <h3 class="filterListHeader">Find/Search2:</h3>
        <ul class="list filterList" name="sdelarray">


<?php 


foreach ($objects as $object)
{

echo '<li><input id="delId" type="checkbox" name="delarray[]" value="'.$object['DELIVERABLE_NAME'].'"> <label for="o1">'.$object['DELIVERABLE_NAME'].'</label></li>';
//echo '<li><input id="o1" type="checkbox"  value="'.$object['DELIVERABLE_NAME'].'"> <label for="o1">'.$object['DELIVERABLE_NAME'].'</label></li>';
}

$sql2 = <<<END_SQL
  select DELIVERABLE_NAME from submittedtaskdeliverable where task_number = $task order by DELIVERABLE_NAME
END_SQL;

//echo "SQL: $sql2";

?>
            <li><input id="o1" name="o1" type="checkbox"> <label for="o1">Test deliverable</label></li>
           <input id="o1" name="task" type="hidden" value="<?php echo $task;?>">
 <input name="returnURL" type="hidden" value="<?php echo "https://intranetca.netcracker.com/prd/releaseallocation/submit_del.php?task=".$task;?> ">
 <input name="apsURL" type="hidden" value="<?php echo $_SERVER['HTTP_REFERER'];?> ">
              
        </ul>
    </div>
    <div class="listWrapper">
        <h3>Selected Deliverable List:</h3>
        <p>Review your selections.</p>
        <ul class="list bucketList"></ul>
    </div>
	
	<?php 
$selectedObjectsList = $db->GetAll($sql2, array('DELIVERABLE_NAME' => 'DELIVERABLE_NAME'));
if (empty($selectedObjectsList)){}
else{
	
	
	?>
	<script>
    callMyFun(<?php echo json_encode($selectedObjectsList);?>);
	</script>
	<?php

	
}
?>
	<input type="submit" name="action" value="Submit Deliverable List" style="margin-left: 850px;"> 
</form>
<!-- <p> Missing deliverable? Add a new deliverable here  <?php echo "<a href=\"add_deliverable.php?task=$task\"> <button>Add Deliverable</button> </a>";?></p> -->


<?php
if (isset($_POST['action']) && $_POST['action'] == "Submit Deliverable List"){
//echo "Clicked submit";

if (!isset($receivedel))
{
echo "<br> Please select deliverables";
exit;
}
$sql="delete from submittedtaskdeliverable where task_number = ".$task."";
$result = $db->Execute($sql, array('X'));

echo "<br><br><br>Submitted Deliverables:<br><hr>";
$count=0;
foreach($receivedel as $del){
echo $del."<br>";
$count++;
$sql2="insert into submittedtaskdeliverable (task_number, deliverable_name) values (".$task.",'".$del."')";

//echo $sql2;
$result2 = $db->Execute($sql2, array('Y'));
}
echo "<br>Total Deliverables: $count";
//echo "<br><br><a href=".$_POST['apsURL'].">Back to APS</a>";
echo "<br><br><a href=\"http://camvlciberca.netcracker.com/APS/patch_summary.php\">Back to APS</a>";
echo "<hr>";

}





?>

</html>