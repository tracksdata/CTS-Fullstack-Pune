
$(document).ready(function(){
$('button').on('click',function(){

$('#div1').text('');    
$.ajax({
type: 'GET',
url: 'http://localhost:9090/Spring-Rest/book',
dataType: 'json',
success: function (books) {
//var myJSON = JSON.stringify(books);
//console.log("Books: "+books);
var tbl=$("<table cellpadding='5' rowpadding='5'/>").attr("id","mytable");
  
  
    $("#div1").append(tbl);

    var ch="<tr bgcolor='lightblue'>";
    var h1="<td>Book Id</td>";
    var h2="<td>Book Title</td>";
    var h3="<td>Book Author</td> </tr>";
    $('#mytable').append(ch+h1+h2+h3);
   
    for(var i=0;i<books.length;i++)
    {
       var book= books[i];

        var tr="<tr bgcolor='skyblue'>";
        var td1="<td>"+book["id"]+"</td>";
        var td2="<td>"+book["title"]+"</td>";
        var td3="<td>"+book["author"]+"</td></tr>";
        
        $("#mytable").append(tr+td1+td2+td3);   


    }
//console.log(data);
},
error: function() { alert('Failed!'); }
});
});

// Save/ Update Book
$("#update").click(function(e) {
   console.log('--- saving data'); 
  e.preventDefault();
  var bookId = $("#bookId").val(); 
  var bookName = $("#bookName").val();
  var author = $("#author").val();
  var dataString = 'Book Id ='+bookId+'& Book Name ='+bookName;
  var obj=new Object();
  obj.id=bookId;
  obj.title=bookName;
  obj.author=author;
  //console.log('Obk: '+JSON.stringify(obj));
  $.ajax({
    type:'POST',
    contentType: "application/json",
    data:JSON.stringify(obj),
    dataType: 'json',
    url:'http://localhost:9090/Spring-Rest/book',
    success:function(data) {
      console.log('Data: '+data);
      //alert(data);
    }
  });
});



});
    


