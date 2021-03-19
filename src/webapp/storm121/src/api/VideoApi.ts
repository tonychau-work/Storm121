import {fetchJson} from "./Api";

export const getAllVideos = async () => {
    return fetchJson("http://localhost:8080/api/video/all");
}

export const getVideosByLandingPage = async (id: string) => {
    return fetchJson("http://localhost:8080/api/landingpage/videos/" +  id);
}