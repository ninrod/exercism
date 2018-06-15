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
    myProp: string = "";
    constructor(public name: string, public age: number) { }

    setProp(p: string) {
        this.myProp = p;
    }
}
const p: Person = new Person("filipe", 36)
p.age = 37;
p.setProp("lol")
console.log(p);

//inheritance, constructors, setters, getters, static methods
class Filipe extends Person {
    _awesomestr: string = "awesome"
    static PI: number = 3.14
    constructor(age: number) {
        super("filipe", age)
    }
    set awesome(s: string) {
        if (s.length < 5) {
            this._awesomestr = s
        } else {
            this._awesomestr = "overwritten awesome"
        }
    }
    get awesome(): string {
        return "awesome awesome"
    }
    static mult(a: number, b: number): number {
        return a * b
    }
}
let filipe = new Filipe(40)
console.log(filipe)
filipe.awesome = "cool"
console.log(filipe)
filipe.awesome = "really, really cool"
console.log(filipe)
console.log(Filipe.mult(2, 2))
console.log(Filipe.PI)
