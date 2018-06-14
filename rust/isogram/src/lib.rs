use std::cmp::Ordering;

// perceba que to_lowercase e to_uppercase retornam um iterator. e tem que retornar mesmo:
// * [unicode faq](http://unicode.org/faq/casemap_charprop.html#11)
// * [reddit](https://www.reddit.com/r/rust/comments/3qdn1s/why_does_to_uppercase_for_chars_return_an_iterator/)
pub fn check(candidate: &str) -> bool {
    let mut chars: Vec<char> = candidate
        .chars()
        .filter(|c| c.is_alphabetic())
        .map(|c| c.to_lowercase().next().unwrap())
        .collect();
    chars.sort_by(|a, b| a.cmp(b));
    for (i, e) in chars.iter().skip(1).enumerate() {
        match e.cmp(chars.iter().nth(i).unwrap()) {
            Ordering::Equal => return false,
            _ => continue,
        }
    }
    true
}
