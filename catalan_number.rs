// program to find the nth catalan number in RUST
// time complexity: O(n)
// space complexity: O(1)

fn binomial_coeff(n: u32, mut k: u32) -> u64 {
    let mut res = 1u64;
    if k > n - k {
        k = n - k;
    }
    for i in 0..k {
        res *= (n - i) as u64;
        res /= (i + 1) as u64;
    }
    return res;
}

fn catalan(n: u32) -> u64 {
    let c = binomial_coeff(2 * n, n);
    return c / (n + 1) as u64;
}

fn main() {
    let n = 10;
    println!("{}",catalan(n));
}