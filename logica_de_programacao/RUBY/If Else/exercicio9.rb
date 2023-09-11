print "Type a number: "
num1 = gets.chomp.to_i

print "Type another number: "
num2 = gets.chomp.to_i

print "Type another number: "
num3 = gets.chomp.to_i

if num1 > num2 && num1 > num3
    if num2 > num3
        puts "#{num1}, #{num2}, #{num3}"
    else
        puts "#{num1}, #{num3}, #{num2}"
    end
elsif num2 > num1 && num2 > num3
    if num1 > num3
        puts "#{num2}, #{num1}, #{num3}"
    else
        puts "#{num2}, #{num3}, #{num1}"
    end
elsif num3 > num1 && num3 > num2
    if num1 > num2
        puts "#{num3}, #{num1}, #{num2}"
    else
        puts "#{num3}, #{num2}, #{num1}"
    end
end