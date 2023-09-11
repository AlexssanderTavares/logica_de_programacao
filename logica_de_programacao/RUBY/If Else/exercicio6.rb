print "Type a number: "
num1 = gets.chomp.to_i

print "Type another number: "
num2 = gets.chomp.to_i

print "Type another number: "
num3 = gets.chomp.to_i

if num1 > num2 && num1 > num3
    puts "#{num1} is greater"
elsif num2 > num1 && num2 > num3
    puts "#{num2} is greater"
elsif num3 > num2 && num3 > num1
    puts "#{num3} is greater"
end

