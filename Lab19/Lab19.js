$(document).ready(function() {// authors Yolanda Gandy and Keesha Readus//
	
	
	var shoppingPrice = [];
	var shoppingName =[];
	var arrayPrice;
	
	$(".add-button").click(function(event) {
		var row = $(this).parent();
		var price = row.children(".price").text();
		var name = row.children(".name").text();
		shoppingName.push(name);
		shoppingPrice.push(price);
		console.log(shoppingName);
		console.log(shoppingPrice);
	});
	
	
	$(".finish-button").click(printReceipt);
	
	function printReceipt() {
		var total =0;
		for (var i = 0; i < shoppingPrice.length; i++) {
			var sPrice = shoppingPrice[i];
			var sName = shoppingName[i];
			total += Number(shoppingPrice[i]);
			console.log("$" + shoppingName + " " + shoppingPrice);
		}
		console.log("Total: $" + total.toFixed(2));
	}
	
});