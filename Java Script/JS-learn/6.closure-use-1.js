

//  to abstract any public-bahv of any module

var counter = (function init() {
    var count = 0; // private
    // public
    function doCount() {
        count++;
    }
    function getCount() {
        return count;
    }
    var o = {
        doCount: doCount,
        getCount: getCount
    };
    return o;
})();

// var counter=init();