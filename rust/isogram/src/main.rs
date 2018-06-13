// extern crate isogram;
// use isogram::check;

use std::iter::FromIterator;

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
        println!("i = {}, j = {:?}", e, s.chars().nth(i).unwrap());
    }
}
