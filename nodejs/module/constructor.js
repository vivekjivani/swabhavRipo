module.exports = function (fname, lname) {
    this.fname = fname;
    this.lname = lname;

    this.fullName = function () {
        console.log(this.fname + " " + this.lname);
    }
}