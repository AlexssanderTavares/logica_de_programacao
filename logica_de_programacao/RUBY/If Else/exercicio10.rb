puts "In what period of the day do you study? 

M - Morning
A - Afternoon
E - Evening

Choose: M - A - E"
option = gets.chomp.to_s

if option.match?(/[mM]/)
    puts "Good Morning"
elsif option.match?(/[aA]/)
    puts "Good Afternoon"
elsif option.match?(/[eE]/)
    puts "Good Evening"
else
    raise "Invalid Entry"
end
