import React from'react'


import '../styles/components/pages/NosotrosPage.css';
const NosotrosPage = (props) =>{
    return(
        <section className="holder">
            <div className="historia">
                <h2>historia</h2>
        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, 
        sed iusmod tempor</p>
        <h2>Staff</h2>
        <div className="personas"></div>
        <img src="images/nosotros/nosotros1.jpg" width ="75" alt="Juan"/>
        <h5>Juan Gomez</h5>
        <h6>Gerente General</h6>
        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, 
        sed iusmod tempor</p>
        </div>
        </section>
    );
}
export default NosotrosPage;