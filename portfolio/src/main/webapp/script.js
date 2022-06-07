window.onload = init;
// ensure all dom elements have loaded first
function init() {
    /**
     * Makes the navigation bar stick to the top
     */
    const navbar = document.getElementById('navbar');
    // When the user scrolls the page, execute fixNavbar
    window.onscroll = function() {fixNavbar()};
    function fixNavbar() {
        if(window.scrollY > navbar.offsetHeight + 100) {
            navbar.classList.add('sticky')
        } else {
            navbar.classList.remove('sticky')
        }
    }
}