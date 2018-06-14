// extern crate isogram;
// use isogram::check;

use std::iter::FromIterator;
use std::cmp::Ordering;

fn main() {
    // println!("check = {}", check(""));

    let mut chars = "filipe"
        .chars()
        .filter(|c| c.is_alphabetic())
        .collect::<Vec<char>>();
    chars.sort_by(|a, b| a.cmp(b));
    println!("test: {:?}", chars);

    let s: String = String::from_iter(chars);
    for (i, e) in s.chars().skip(1).enumerate() {
        let c = s.chars().nth(i).unwrap();
        println!("i = {}, j = {:?}", e, c);
        match e.cmp(&c) {
            Ordering::Equal => {
                println!("found equal !");
                break;
            }
            _ => println!("different. continuing"),
        }
    }
}
