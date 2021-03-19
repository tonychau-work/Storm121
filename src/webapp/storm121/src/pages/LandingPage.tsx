import React, {useEffect, useState} from "react";
import {RouteComponentProps} from "react-router-dom";
import {getVideosByLandingPage} from "../api/VideoApi";
import {Video} from "../models/Video";
import {Table} from "react-bootstrap";
import {TableRow} from "../compontent/DataTable";

interface RouteParams {
    id: string
}

interface LandingPageProps extends RouteComponentProps<RouteParams> {
}

const LandingPage: React.FC<LandingPageProps> = (props) => {
    const [videos, setvideos] = useState([] as Video[]);

    useEffect(() => {
        getVideosByLandingPage(props.match.params.id)
            .then(json => {
                console.log(json);
                setvideos(json);
            });
    }, []);

    return (
        <div>
            <h1>Videos</h1>
            <Table striped bordered hover>
                <thead>
                <tr>
                    <th>ID</th>
                    <th>URL</th>
                    <th>View Count</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    {videos.map((video) => (
                        <TableRow
                            row={[video.id, video.url, video.videoMeta.viewCount]}
                        />
                    ))}
                </tr>
                </tbody>
            </Table>
        </div>
    );
}

export default LandingPage;