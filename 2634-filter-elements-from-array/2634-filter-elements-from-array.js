/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    arr = arr.filter(fn);
    //console.log(arr);
    return arr;
};
