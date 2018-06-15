pub fn twofer(name: &str) -> String {
    let s = if !name.is_empty() { name } else { "you" };
    format!("One for {}, one for me.", s)
}
