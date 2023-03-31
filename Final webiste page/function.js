$(".orders").on("click", ".add", function(){
  var count = $(this).siblings(".count");
  count.html(parseInt(count.html())+1);
});

$(".orders").on("click", ".minus", function(){
  var count = $(this).siblings(".count");
  if(count.html() > "0"){
    count.html(parseInt(count.html())-1);
  }if(count.html() == "0"){
    $(this).parent().remove();
  }
});

$(".dropdown-item").on("click", function(){
  var name = $(this).html();
  $(".orders").css("display", "block");
  $(".orders").append(`<li> <div class='orderName'>${name}</div><div class='count'>1</div><div class='add'>+</div><div class='minus'>-</div</li>`);
});

function loginMenu(){
  $(".popups").css("display", "block");
  $("#loginMenu").css("display", "block");
  $("#signupMenu").css("display", "none");
  $("#locationMenu").css("display", "none");
  $("#aboutMenu").css("display", "none");
}

function signupMenu(){
  $(".popups").css("display", "block");
  $("#loginMenu").css("display", "none");
  $("#signupMenu").css("display", "block");
  $("#locationMenu").css("display", "none");
  $("#aboutMenu").css("display", "none");
}

function locationMenu(){
  $(".popups").css("display", "block");
  $("#loginMenu").css("display", "none");
  $("#signupMenu").css("display", "none");
  $("#locationMenu").css("display", "block");
  $("#aboutMenu").css("display", "none");
}

function aboutMenu(){
  $(".popups").css("display", "block");
  $("#loginMenu").css("display", "none");
  $("#signupMenu").css("display", "none");
  $("#locationMenu").css("display", "none");
  $("#aboutMenu").css("display", "block");
}

function showOrders(){
  if($(".orders").css("display") == "none"){
    $(".orders").css("display", "block");
  }else{
    $(".orders").css("display", "none");
  } 
}