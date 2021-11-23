// The document.addEventListener() method attaches an event handler to the document.
window.addEventListener("load",init);



var auto = autoGen();
function loadId(){
    // The querySelector() method returns the first element that matches a specified CSS selector(s) in the document.
    document.querySelector('#id').innerText = auto.next().value;
    // The focus() method is used to give focus to an element (if it can be focused).
    // document.querySelector('#id').focus();
}
function clearAll(){
    itemObject = new Item();
    for(let key in itemObject){
        if(key=='isMarked' || key=='id'){
            continue;
        }
        document.querySelector('#'+key).value = '';
    }
}

function init(){
    clearAll();
    loadId();
    showTotal();
    bindEvents();
    showHideSearchBar();
   
}
function updateRecord(){
    for(let key in itemObject){
        if(key=='isMarked'){
            continue;
        }
        itemObject[key] = document.querySelector('#'+key).value;
    }
    printTable(itemOperations.items);
}




function bindEvents(){
    document.querySelector('#update').addEventListener('click',updateRecord);
    document.querySelector('#remove').addEventListener('click',deleteRecords);
    document.querySelector('#add').addEventListener('click',addRecord);
}

function search(){
    var val = document.querySelector('#searchTxt').value;
    var key = document.querySelector('#searchby').value;
    var items = itemOperations.searchAll(key,val);
    printTable(items);
}

function deleteRecords(){
    var items = itemOperations.remove();
    printTable(items);
}

function showTotal(){
    document.querySelector('#total').innerText = itemOperations.items.length;
    document.querySelector('#mark').innerText = itemOperations.countTotalMark();
    document.querySelector('#unmark').innerText = itemOperations.items.length - itemOperations.countTotalMark();
}

function createIcon(className,fn, id){

    var iTag = document.createElement("i");
    iTag.className = className;
    iTag.addEventListener('click',fn);
    iTag.setAttribute("data-itemid", id) ;

    return iTag;
}

var itemObject;
function edit(){
    var id = this.getAttribute('data-itemid');
     itemObject = itemOperations.search(id);
     fillFields();
    console.log("i am Edit ",this.getAttribute('data-itemid'));
}

function fillFields(){
    for(let key in itemObject){
        if(key=='isMarked'){
            continue;
        }
        document.querySelector('#'+key).value = itemObject[key];
    }
}

function trash(){
    let id = this.getAttribute('data-itemid');
    itemOperations.markUnMark(id);
    showTotal();
    let tr = this.parentNode.parentNode;
    
    // The classList property returns the class name(s) of an element, as a DOMTokenList object.

    // This property is useful to add, remove and toggle CSS classes on an element.
    
    // The classList property is read-only, however, you can modify it by using the add() and remove() methods.
    
    tr.classList.toggle('alert-danger');
    console.log("I am Trash ",this.getAttribute('data-itemid'))
}

function addRecord(){
    var item = new Item();
    for(let key in item){
        if(key=='isMarked'){
            continue;
        }
        if(key=='id'){
            item[key] = document.querySelector('#'+key).innerText;
            continue;
        }
        item[key] = document.querySelector('#'+key).value;
    }
    itemOperations.add(item);
    printRecord(item);
    console.log('Item Object is ',item);
    showTotal();
    loadId();
    clearAll();
}
function printTable(items){
   var tbody =  document.querySelector('#items');
   tbody.innerHTML ='';
    items.forEach(item=>printRecord(item));
    showTotal();
}
function printRecord(item){
    var tbody = document.querySelector('#items');
    var tr = tbody.insertRow();
    var index = 0;
    for(let key in item){
        if(key=='isMarked'){
            continue;
        }
        let cell = tr.insertCell(index);
        cell.innerText = item[key] ;
        index++;
    }
    var lastTD = tr.insertCell(index);
    lastTD.appendChild(createIcon('fas fa-trash mr-2',trash,item.id));
    lastTD.appendChild(createIcon('fas fa-edit',edit,item.id));
}
