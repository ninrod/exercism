use std::cmp::Ordering;

pub fn check(candidate: &str) -> bool {
    let mut chars = candidate
        .chars()
        .filter(|c| c.is_alphabetic())
        .collect::<Vec<char>>();
    chars.sort_by(|a, b| a.cmp(b));
    for (i, e) in chars.iter().skip(1).enumerate() {
        match e.cmp(chars.iter().nth(i).unwrap()) {
            Ordering::Equal => return false,
            _ => continue,
        }
    }
    true
}
