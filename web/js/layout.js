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

//$(function(){
//    $("#menu").load("./Layout/MenuLayoutOut.html");
//    $("#footer").load("./Layout/FooterLayout.html");
//});

var myApp = angular.module('myApp', []);
myApp.run(function ($templateCache) {
    $templateCache.put('templateId.html',
            '<section id="top" class="section" data-spacing="none" >\n\
    < div class = "container" >\n\
    < div class = "row" >\n\
< div class = "span12" >\n\
< div class = "navbar" >\n\
< div class = "navbar-inner" >\n\
< button type = "button" class = "btn btn-navbar" data - toggle = "collapse" data - target = ".nav-collapse" >\n\
< span class = "icon-bar" > < /span>\n\
< span class = "icon-bar" > < /span>\n\
< span class = "icon-bar" > < /span>\n\
< span class = "icon-bar" > < /span>\n\
                    < /button>\n\
                    < a href = "../General/MenuIn.html" class = "brand" > < img class = "logo" src = "../images/Logos/logo_Edupol.jpg" alt = "" / > profit + < /a>\n\
                    < div class = "nav-collapse collapse" >\n\
                    < ul class = "nav" >\n\
                    < li class = "active" > < a href = "../General/MenuIn.html" > Home < /a></li >\n\
                    < li class = "dropdown" data - ng - repeat = "modulo in navega.main.listModuloModel" >\n\
                    < a href = "#" data - ng - class = "dropdown - toggle" data - toggle = "dropdown" > {{modulo.sNombre}} < /a>\n\
                <ul class = "dropdown-menu" >\n\
                <li class = "stack" data - ng - repeat = "pagina in modulo.listPaginaModel" >\n\
                <a href = "..{{pagina.sRuta}}" > {{pagina.sNombre}} < /a>\n\
                </li>\n\
                </ul>\n\
                </li>\n\
                <li class = "dropdown" data-ng-click = "navega.invalidSession()" > < a href = "../" >Cerrar Sesion </a></li >\n\
                    < /ul>\n\
                    < /div>\n\
                < /div>\n\
                < /div>\n\
                < /div>\n\
                < /div>\n\
                < /div>\n\
                < /section>'

            );
});


