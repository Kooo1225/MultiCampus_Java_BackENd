function off() {
  alert('Function Test!');
}

function on(x, k) {
  alert(`Input Value : ${x}, ${k}`);
}

function test() {
  console.log('Call by test()');

  let el = document.getElementById('name');
  if (el) {
    id = el.value;
    console.log('Input ID : ' + id);
  }
}

function add() {
  console.log('Add Function Process');
}

function minus() {
  console.log('Minus Function Process');
}
