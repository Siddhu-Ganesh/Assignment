// Take a sentence as an input and reverse every word in that sentence.
// Example - This is a sunny day > shiT si a ynnus yad. 

function wordsReverseInSentence(sentence) {

    const words = sentence.split(' ');


    const reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });


    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}


const inputSentence = "This is a sunny day";
const reversedSentence = wordsReverseInSentence(inputSentence);
console.log(reversedSentence);
