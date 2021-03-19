import {Video} from "./Video";


export type LandingPageMeta = {
    id: number;
    hitCount: string;
}

export type LandingPageObject = {
    id: number;
    url: string;
    landingPageMeta: LandingPageMeta;
    videos: Video[];
}
