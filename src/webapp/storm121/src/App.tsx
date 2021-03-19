import React, {useEffect, useState} from 'react';
import './App.css';
import {getAllLandingPages} from "./api/LandingPageApi";
import {LandingPageObject} from "./models/LandingPageObject";
import {Table} from "react-bootstrap";
import {TableRow} from "./compontent/DataTable";

const App = () => {
    const [landingPages, setLandingPages] = useState([] as LandingPageObject[]);

    useEffect(() => {
        getAllLandingPages()
            .then(json => {
                console.log(json);
                setLandingPages(json);
            });
    }, []);

    return (
        <div>
            <h1>Landing Pages</h1>
            <Table striped bordered hover>
                <thead>
                <tr>
                    <th>ID</th>
                    <th>URL</th>
                    <th>Hit Count</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    {landingPages.map((landingPage) => (
                        <TableRow
                         row={[landingPage.id, landingPage.url, landingPage.landingPageMeta.hitCount]}
                         onClick={() => {window.location.href=`/landingpage/${landingPage.id}`}}
                        />
                    ))}
                </tr>
                </tbody>
            </Table>
        </div>
    );
}

export default App;
