((n) => {
  a=[]
  for(let i=1 ;i <= n;i++)
    a.push(i)
  return a
})(1000).filter(p => {
  for(let i=2; i<p/2;i++)
    if (p % i === 0)
      return false
  return true
}).forEach(e => console.log(e))
