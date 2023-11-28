let test = ["filipe", "mm", "mama", "anilina", "sopapos", "ama", "radar"]

function p(s) {
  //return (s === '') ? '' : p(s.substr(1)) + s.charAt(0);
  let a="";
  for (let i = s.length-1; i >= 0; i--) {
    a+=s[i]
  }
  return a
}

test.forEach((e) => {
  console.log(e + ' = ' + p(e))
})
