print "Type a grade: "
grade1 = gets.chomp.to_f

print "Type another grade: "
grade2= gets.chomp.to_f

average = grade1 + grade2 / 2

if average >= 5
    puts "Approved"
else
    puts "Disapproved"
end