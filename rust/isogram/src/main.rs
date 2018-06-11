// extern crate isogram;
// use isogram::check;

use std::iter::FromIterator;

fn main() {
    // println!("check = {}", check(""));

    let wordy: String = "I am a hello world example".to_owned().to_lowercase();
    let s_slice: &str = &wordy[..];

    let mut chars: Vec<char> = s_slice.chars().filter(|c| c.is_alphabetic()).collect();
    chars.sort_by(|a, b| a.cmp(b));

    println!("test{:?}", chars);
    let s: String = String::from_iter(chars);
    println!("{}", s);
}
