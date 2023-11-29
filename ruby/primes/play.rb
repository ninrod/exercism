def is_prime(n)
  return false if n < 1
  return true if n < 3
  return false if n.even?

  for i in (3..n/2).filter { |e| e.odd? } do
    return false if n % i == 0
  end

  true
end

def primes(n)
  (1..n).filter {|e| is_prime(e)}
end

primes(1000).each { |e| puts e }
