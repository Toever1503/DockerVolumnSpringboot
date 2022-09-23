#NOTE

- ImageTest.jpg is a test image

#USAGE
docker run -tdp 8080:8080 -v "E:\uploads:/app/uploads" --name docker-volumn docker-volumn:latest

#explation
- -tdp 8080:8080 : run container in background and map port 8080's container to 8080's host
- -v "E:\uploads:/app/uploads" map host's folder(E:\uploads) to container's folder(/app/uploads)