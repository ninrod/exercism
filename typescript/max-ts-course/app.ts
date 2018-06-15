// type aliasing
type Complex = {
    num: number,
    a: string[]
}

// type aliasing usage
let o: Complex = {
    num: 2,
    a: ["filipe", "silva"]
}

// destructuring demo
let { a: [, f] } = o;

// string interpolation
console.log(`f = ${f}`);