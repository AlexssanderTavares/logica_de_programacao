print "Type a char: "
char = gets.chomp.to_s



if char.match?(/[aeiou]/)
    puts "Vowel"
else
    puts "Consonant"
end
