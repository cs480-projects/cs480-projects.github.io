// Simple scroll animation for tech stack
document.addEventListener('DOMContentLoaded', function() {
    const techItems = document.querySelectorAll('#tech .fade-in-up');
    
    const observer = new IntersectionObserver((entries) => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                entry.target.style.animationPlayState = 'running';
            }
        });
    }, {
        threshold: 0.1
    });
    
    techItems.forEach(item => {
        observer.observe(item);
    });
});