print "Type a number: "
num1 = gets.chomp.to_i

print "Type another number: "
num2 = gets.chomp.to_i

print "Type another number: "
num3 = gets.chomp.to_i

if num1 > num2 && num1 > num3
    if num2 > num3
        puts "#{num1} is greater and #{num3} is lower"
    elsif num3 > num2
        puts "#{num1} is greater and #{num2} is lower"
    end
elsif num2 > num1 && num2 > num3
    if num1 > num3
        puts "#{num2} is greater and #{num3} is lower"
    elsif num3 > num1
        puts "#{num2} is greater and #{num1} is lower"
    end
elsif num3 > num2 && num3 > num1
    if num2 > num1
        puts "#{num3} is greater and #{num1} is lower"
    elsif num1 > num2
        puts "#{num3} is greater and #{num2} is lower"
    end
end

