def pal(s)
  return '?' if s.length < 3
  return 'S' if s.reverse == s
  'N'
end
a=["filipe", "mm", "mama", "anilina","sopapos", "ama", "radar"]

a.each { |e|
  puts e + ' = ' + pal(e)
}
