//interface
function insertItem(index, node) {} //take care if index head
function getItem(index) {}
function find(node) {}
function append(node) {}
function remove(index) {}
function removeLast() {}
function getNext() {}
function getSize() {}
function clear() {}
function equal(x, y) {}//compare by node or index
function exists(node) {} //boolean



//sketch
function Node(data) {
  this.data = data;
  this.next = null;
}


function RunList() {
  const head = new Node("teste head");
  head.next = new Node("index 1");
  console.log(head);
}


RunList();