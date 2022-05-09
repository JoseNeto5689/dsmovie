import {ReactComponent as GithubIcon} from "../../img/github.svg"
import './style.css'
function NavBar(){
    return <header>
      <nav className="container" >
        <div className="dsmovie-nav-content" >
          <h1>DSMOVIE</h1>
          <a href="https://github.com/JoseNeto5689/">
            <div className="dsmovie-contact-container" >
              <GithubIcon/>
              <p className="dsmovie-contact-link" >/JoseNeto5689</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
}

export default NavBar;