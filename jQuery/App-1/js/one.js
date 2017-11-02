$(document).ready(function(){
$('.vacation').on('click','button',function(){
    
    var vacation=$(this).closest('.vacation');
    var amount=vacation.data('price');
    var price = $(`<p> ${amount} </p>`);
    vacation.append(price);
    //price.appendTo($('.vacation'))
    
    //$(this).closest('div').append(price);
    $(this).remove();
})

$('#filters').on('click','.btn-success',function(){
    console.log('-- on salle');
    $('.bg-info').removeClass('bg-info');
    $('.vacation').filter('.onsale').addClass('bg-info');

})

$('#filters').on('click','.btn-danger',function(){
    $('.bg-info').removeClass('bg-info');
    $('.vacation').filter('.expire').addClass('bg-info');

})




});