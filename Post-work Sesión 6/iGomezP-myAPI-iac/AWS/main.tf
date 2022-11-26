terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "4.40.0"
    }
  }
}

provider "aws" {
  region     = var.region
  access_key = var.access_key
  secret_key = var.secret_key
}

# resource "aws_vpc" "dev-vpc" {
#   cidr_block           = "10.0.0.0/16"
#   enable_dns_support   = "true"
#   enable_dns_hostnames = "true"
#   instance_tenancy     = "default"
#   tags = {
#     Name = "dev-vpc"
#   }
# }

# resource "aws_subnet" "dev-subnet-public-1" {
#   vpc_id                  = aws_vpc.dev-vpc.id
#   cidr_block              = "10.0.1.0/24"
#   map_public_ip_on_launch = "true"
#   availability_zone       = "us-west-1a"
#   tags = {
#     Name = "dev-subnet-public-1"
#   }
# }

resource "aws_instance" "ec2_instance" {
  ami           = var.ami_id
  instance_type = var.instance_type
  # subnet_id     = aws_subnet.dev-subnet-public-1.id
  key_name               = "VakzorEc2Bedu"
  vpc_security_group_ids = ["sg-0c811d0b014fd59a5"]
  tags = {
    Name        = "dev-server-1",
    Environment = "Develop",
    Owner       = "iGomezP"

  }
}

# Crear un repositorio para pushear el contenedor del microservicio
resource "aws_ecr_repository" "igomezp-myapi-microservicio-a" {
  name = "igomezp-myapi-microservicio-a"
  tags = {
    Name  = "Repo Bedu",
    Owner = "iGomezP"
  }
}

output "public_ip" {
  value = aws_instance.ec2_instance.public_ip
}
