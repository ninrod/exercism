pub fn check(candidate: &str) -> bool {
    let mut chars = candidate
        .chars()
        .filter(|c| c.is_alphabetic())
        .collect::<Vec<char>>();
    chars.sort_by(|a, b| a.cmp(b));
    println!("test: {:?}", chars);
    unimplemented!("Is {} an isogram?", candidate);
}
