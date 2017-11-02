$(document).ready(function(){


$('.vacation').on('click','button',function(){  
 
var price=$('<p> From 84683 </p>');
 
var vacation=$(this).closest('.vacation');

var amount=vacation.data('price');
var price=$(`<p> &#8377; ${amount} </p>`);

//price.appendTo('.vacation');
price.appendTo(vacation);
$(this).remove();

})


$('#filters').on('click','.onSale-filter',function(){
   $('.bg-info').removeClass('bg-info');
   $('.vacation').filter('.onSale').addClass('bg-info');

})

$('#filters').on('click','.expiring-filter',function(){
   $('.bg-info').removeClass('bg-info');
   $('.vacation').filter('.expiring').addClass('bg-info'); 
})


$('.confirmation').on('click','button',function(){
    $(this).closest('.confirmation').find('.tickets').slideToggle();
})


});