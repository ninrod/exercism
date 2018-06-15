type Complex = {
    num: number,
    a: string[]
}

let o: Complex = {
    num: 2,
    a: ["filipe", "silva"]
}

let { a: [, f] } = o;

console.log(`f = ${f}`);