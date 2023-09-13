sum = 1
sentence = "S = #{sum} + "
print = "Enter a number: "
num = gets.chomp.to_i
count = 2
while count <= num do
    frag = sum.to_s + '/' + count.to_s
    opr = " + "
    if count < num
        frag += opr
        sentence += frag
    else
        sentence += frag
    end
    if count == num
        puts sentence
    end
    count+=1
end


