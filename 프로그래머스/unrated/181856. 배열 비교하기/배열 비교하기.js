function solution(arr1, arr2) {
    let answer = 0;

    if (arr1.length !== arr2.length) {
        const max = Math.max(arr1.length, arr2.length);

        if (max === arr1.length) answer = 1;
        if (max === arr2.length) answer = -1;
    }

    if (arr1.length === arr2.length) {
        let sum = [];

        sum[0] = arr1.reduce((acc, cur) => {
            acc += cur;

            return acc;
        }, 0);
        
        sum[1] = arr2.reduce((acc, cur) => {
            acc += cur;

            return acc;
        }, 0);

        if (sum[0] > sum[1]) answer = 1;
        if (sum[0] < sum[1]) answer = -1;
    }

    return answer;
}