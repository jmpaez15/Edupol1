/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//var layout = document.querySelector('link[rel="import"]').import;
//var head = layout.querySelector('#top');
//var prefooter = layout.querySelector('#inPrefooter');
//var footer = layout.querySelector('#inFooter');
//document.getElementById("menu").appendChild(head.cloneNode(true));
//document.getElementById("prefooter").appendChild(prefooter.cloneNode(true));
//document.getElementById("footer").appendChild(footer.cloneNode(true));

$(function(){
    $("#menu").load("./Layout/MenuLayoutOut.html");
    $("#footer").load("./Layout/FooterLayout.html");
});


