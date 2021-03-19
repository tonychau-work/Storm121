import {fetchJson} from "./Api";

export const getAllLandingPages = async () => {
    return fetchJson("http://localhost:8080/api/landingpage/all")
}