$(document).ready(function(){


$('.vacation').on('click','button',function(){  
 
 
var vacation=$(this).closest('.vacation');

var amount=vacation.data('price');
var price=$(`
             <p> &#8377; ${amount} per Ticket </p>
                <p>
                Tickets:
                <input type='number' class='quantity form-control' value='1' />
                </p>
                <p>Total Price: <span id='total'>&#8377; ${amount}</span></p>

                `);

//price.appendTo('.vacation');
price.appendTo(vacation);
//$(this).before(price);
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


$('.vacation').on('keyup change','.quantity',function(){
    var price = $(this).closest('.vacation').data('price');
    var quantity=+$(this).val();
    $('#total').text(quantity*price); 
})


});