// type aliasing
type Complex = {
    num: number | string | number[],
    a: string[]
}

// type aliasing usage
let o: Complex = {
    num: 2,
    a: ["filipe", "silva"]
}

let z: Complex = {
    num: [1, 2],
    a: ["lol", "zors"]
}

// destructuring demo
let { a: [, ...f] } = o;
let { num: n } = z;

// string interpolation
console.log(`f = ${f}`);
console.log(`n = ${n}`);

// const objects have mutable properties
class Person {
    constructor(public name: string, public age: number) { }
}
const p: Person = new Person("filipe", 36)
p.age = 37;
console.log(p);