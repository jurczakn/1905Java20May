function bubble(element, event) {
    console.log(element);
    element.style.backgroundColor = "blue";
    alert(element.id);
}

/*Event Propagation occurs when you have multiple nested elements
*that all register the same neven
*
*2 Types:
* 
*Bubbling-goes from the child element that was clicked on
*up thorugh the parent elements.
*
*Capturing-goes from the parent element down back through the children
*stopping at the element that triggered the inital event.
*/

window.onload = function() {
    document.getElementById("A").addEventListener("click", 
    function(event) {bubble(this, event);});//(event)=>{bubble(this,event)})
    document.getElementById("B").addEventListener("click", 
    function(event) {bubble(this, event);}, false);
    document.getElementById("C").addEventListener("click", 
    function(event) {bubble(this, event);}, false);
    document.getElementById("D").addEventListener("click", 
    function(event) {bubble(this, event);}, false);
}

//addEventListener("click", bubble(this));