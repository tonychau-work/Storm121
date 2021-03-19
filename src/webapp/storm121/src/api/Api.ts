export const fetchJson = (url: string) => fetch(url,
    {
        headers: {
            'Content-Type': 'application/json',
            'Accept': 'application/json'
        }
    }
).then(response => {
    return response.json();
})