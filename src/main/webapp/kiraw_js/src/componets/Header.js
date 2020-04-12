import React from 'react';
import { Nav, Navbar, Form , FormControl, Button} from 'react-bootstrap'
import '../assets/css/header.css'

function Cabezera() {
    return (
        <div>
            <Navbar className="header">
                <Navbar.Brand href="#home">Kiraw</Navbar.Brand>
                <Nav className="mr-auto">
                    <Nav.Link href="#home">Home</Nav.Link>
                    <Nav.Link href="#features">Features</Nav.Link>
                    <Nav.Link href="#pricing">Pricing</Nav.Link>
                </Nav>
                <Form inline>
                    <FormControl type="text" placeholder="Search" className="mr-sm-2" />
                    <Button variant="outline-info">Search</Button>
                </Form>
            </Navbar>
        </div>
    );
}

export default Cabezera